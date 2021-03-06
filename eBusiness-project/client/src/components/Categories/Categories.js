import React, {Component} from 'react';
import {connect} from 'react-redux';
import * as actions from '../../actions';
import {withRouter} from 'react-router-dom';

import './Categories.css'

class Categories extends Component {

    constructor(props) {
        super(props);

        this.state = this.getInitialState();
    }

    getInitialState = () => {
        return {
            activeCat: [false, false, false],
            categories: ['Fotele dla graczy', 'Fotele do komputera', 'Fotele Gabinetowe', 'Fotele konferencyjne']
        }
    };

    getProductByCategory = (category, i) => {
        const activeCat = [false, false, false];
        activeCat[i] = true;
        this.setState({activeCat: [...activeCat]});

        this.props.filterProductsByCategory(category);
        this.props.history.push('/');
    };

    renderCategory = () => {
        return this.state.categories.map((category, i) => {
            return <div key={i} className={this.state.activeCat[i] ? "category active" : "category"}
                        onClick={() => this.getProductByCategory(category, i)}>
                {category}
            </div>
        })
    };

    render() {
        return <div className="container">
            <div className="row">
                <div className="categories-wrapper">
                    {this.renderCategory()}
                </div>
            </div>
        </div>
    }
}

export default withRouter(connect(null, actions)(Categories));