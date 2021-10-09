package lk.ijse.ThogaKade.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.ThogaKade.model.Item;

import java.sql.SQLException;

/**
 * @author Sandaru Kithshan <skithshan93@gmail.com> (github.com/Sandaru293)
 * @since 10/9/2021
 */
public class ItemFormController {
    public TextField txtCode;
    public TextField txtdescription;
    public TextField txtunitPrice;
    public TextField txtqtyOnHand;

    public void btnSaveItemOnAction(ActionEvent actionEvent) {
        Item i1 = new Item(
                txtCode.getText(),
                txtdescription.getText(),
                Double.parseDouble(txtunitPrice.getText()),
                Integer.parseInt(txtqtyOnHand.getText())

        );


        try {
            if (new ItemController().addItem(i1)){
                new Alert(Alert.AlertType.CONFIRMATION, "Saved").show();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
