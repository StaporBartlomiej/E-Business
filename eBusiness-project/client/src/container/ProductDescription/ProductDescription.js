import React, {Component} from 'react';
import {connect} from 'react-redux';
import {withRouter} from 'react-router-dom';
import * as actions from '../../actions';

import Header from '../Header/Header';

import './ProductDescription.css';

class ProductDescription extends Component {

    constructor(props) {
        super(props);
        this.state = {
            idProduct: parseInt(props.match.params.id, 10),
            quantity: 1
        }
    }

    componentDidMount() {
        this.props.getProduct(this.state.idProduct);
    }

    changeQuantity = type => {
        let {quantity} = this.state;

        if (type === "UP") {
            quantity += 1;
        } else {
            if (quantity < 2) {
                return;
            }
            quantity -= 1;
        }

        this.setState({quantity});
    };

    addProductToCart = id => {
        const {quantity} = this.state;
        this.props.addProductsToShoppingCart(id, quantity);
    };

    renderDescription = () => {
        const {product} = this.props;
        if (product) {
            return (
                <div className="container product-container">
                    <div className="row">
                        <div className="col-lg-12">
                            <h1 className="product-title">{product.title}</h1>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-lg-6 img-box">
                            <img src={`/images/${product.imgUrl}`} alt=""/>
                        </div>
                        <div className="col-lg price-box">
                            <div>
                                <div className="price">
                                    <p>Cena: <span>{product.cost}</span></p>
                                </div>
                                {product.freeDelivery ?
                                    <div className="free-delivery">
                                        <span>Darmowa dostawa</span>
                                    </div> : null}
                                <div className="avaible">Dostępny</div>
                                <span className="horizontal-line"></span>
                                <div className="section-buy">
                                    <p>Ilość: </p>
                                    <div className="quantity">
                                        <div onClick={() => this.changeQuantity("UP")}>
                                            <i className="fas fa-plus"></i>
                                        </div>
                                        <p className="amount">{this.state.quantity}</p>
                                        <div onClick={() => this.changeQuantity("DOWN")}>
                                            <i className="fas fa-minus"></i>
                                        </div>
                                    </div>
                                    <button className="btn-buy-product" onClick={() => this.addProductToCart(product.id)}>
                                        <i className="fas fa-shopping-cart"></i>
                                        Dodaj do koszyka
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="row product-description">
                        <div className="col-lg">
                            <p>{product.description}</p>
                        </div>
                    </div>
                </div>
            )
        }
    };

    render() {
        return <div>
            <Header/>
            {this.renderDescription()}
        </div>
    }
}

const mapStateToProps = state => {
    return {
        product: state.product.product
    }
};

export default withRouter(connect(mapStateToProps, actions)(ProductDescription));