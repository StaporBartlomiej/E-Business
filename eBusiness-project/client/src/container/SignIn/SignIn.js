import React, {Component, Fragment} from 'react';
import {connect} from 'react-redux';
import * as actions from '../../actions/index'

import Header from '../Header/Header';
import './SignIn.css';
import {reduxForm} from "redux-form";




class SignIn extends Component {

    componentWillReceiveProps(nextProps) {
        if (nextProps.authenticated) {
            this.props.history.push('/');
        }
    }

    render() {

        return (
            <Fragment>
                <Header/>
                <div className="oauth">
                    <a href="http://localhost:9090/signIn">
                        <button className="btn-oauth">
                            Zaloguj
                        </button>
                    </a>

                </div>
            </Fragment>
        )
    }
}


const validate = values => {
    const errors = {};

    if (!values.username) {
        errors.username = 'Add your username!'
    } else if (!values.password) {
        errors.password = 'Add your password!'
    }

    return errors;
};

const reduxFormSignIn = reduxForm({
    form: 'signin',
    validate
})(SignIn);

const mapStateToProps = state => {
    return {
        authenticated: state.user.authenticated,
        errorMessage: state.user.error
    }
};

export default connect(mapStateToProps, actions)(reduxFormSignIn);
