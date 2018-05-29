package com.etraffic.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tableBusQueue;

    @FXML
    private TableColumn<?, ?> columnBusLicencePlate;

    @FXML
    private TableColumn<?, ?> columnBusDriver;

    @FXML
    private TableView<?> tablePassengersList;

    @FXML
    private TableColumn<?, ?> columnPassengerName;

    @FXML
    private TableColumn<?, ?> columnPassengerFare;

    @FXML
    private Button btnAddBus;

    @FXML
    private Button btnDeleteBus;

    @FXML
    private Button btnAddPassenger;

    @FXML
    private Button btnDeletePassenger;

    @FXML
    private Button btnEditBus;

    @FXML
    private Button btnEditPassenger;

    @FXML
    void initialize() {
        assert tableBusQueue != null : "fx:id=\"tableBusQueue\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert columnBusLicencePlate != null : "fx:id=\"columnBusLicencePlate\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert columnBusDriver != null : "fx:id=\"columnBusDriver\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert tablePassengersList != null : "fx:id=\"tablePassengersList\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert columnPassengerName != null : "fx:id=\"columnPassengerName\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert columnPassengerFare != null : "fx:id=\"columnPassengerFare\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert btnAddBus != null : "fx:id=\"btnAddBus\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert btnDeleteBus != null : "fx:id=\"btnDeleteBus\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert btnAddPassenger != null : "fx:id=\"btnAddPassenger\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert btnDeletePassenger != null : "fx:id=\"btnDeletePassenger\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert btnEditBus != null : "fx:id=\"btnEditBus\" was not injected: check your FXML file 'etraffic.fxml'.";
        assert btnEditPassenger != null : "fx:id=\"btnEditPassenger\" was not injected: check your FXML file 'etraffic.fxml'.";

    }
}
