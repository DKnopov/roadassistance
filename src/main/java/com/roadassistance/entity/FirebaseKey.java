package com.roadassistance.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "firebase")
public class FirebaseKey implements Serializable {
    String type;
    @Id
    String project_id;
    String private_key_id;
    String private_key;
    String client_email;
    String client_id;
    String auth_uri;
    String token_uri;
    String auth_provider_x509_cert_url;
    String client_x509_cert_url;

    public FirebaseKey() {
    }

    public FirebaseKey(String type, String project_id, String private_key_id, String private_key, String client_email, String client_id, String auth_uri, String token_uri, String auth_provider_x509_cert_url, String client_x509_cert_url) {
        this.type = type;
        this.project_id = project_id;
        this.private_key_id = private_key_id;
        this.private_key = private_key;
        this.client_email = client_email;
        this.client_id = client_id;
        this.auth_uri = auth_uri;
        this.token_uri = token_uri;
        this.auth_provider_x509_cert_url = auth_provider_x509_cert_url;
        this.client_x509_cert_url = client_x509_cert_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getPrivate_key_id() {
        return private_key_id;
    }

    public void setPrivate_key_id(String private_key_id) {
        this.private_key_id = private_key_id;
    }

    public String getPrivate_key() {
        return private_key;
    }

    public void setPrivate_key(String private_key) {
        this.private_key = private_key;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getAuth_uri() {
        return auth_uri;
    }

    public void setAuth_uri(String auth_uri) {
        this.auth_uri = auth_uri;
    }

    public String getToken_uri() {
        return token_uri;
    }

    public void setToken_uri(String token_uri) {
        this.token_uri = token_uri;
    }

    public String getAuth_provider_x509_cert_url() {
        return auth_provider_x509_cert_url;
    }

    public void setAuth_provider_x509_cert_url(String auth_provider_x509_cert_url) {
        this.auth_provider_x509_cert_url = auth_provider_x509_cert_url;
    }

    public String getClient_x509_cert_url() {
        return client_x509_cert_url;
    }

    public void setClient_x509_cert_url(String client_x509_cert_url) {
        this.client_x509_cert_url = client_x509_cert_url;
    }

    @Override
    public String toString() {
        return "FirebaseKey{" +
                "type='" + type + '\'' +
                ", project_id='" + project_id + '\'' +
                ", private_key_id='" + private_key_id + '\'' +
                ", private_key='" + private_key + '\'' +
                ", client_email='" + client_email + '\'' +
                ", client_id='" + client_id + '\'' +
                ", auth_uri='" + auth_uri + '\'' +
                ", token_uri='" + token_uri + '\'' +
                ", auth_provider_x509_cert_url='" + auth_provider_x509_cert_url + '\'' +
                ", client_x509_cert_url='" + client_x509_cert_url + '\'' +
                '}';
    }
}
