package lk.ijse.ThogaKade.controller;

import lk.ijse.ThogaKade.model.Customer;
import lk.ijse.ThogaKade.model.Item;
import lk.ijse.ThogaKade.utils.CrudUtil;

import java.sql.SQLException;

/**
 * @author Sandaru Kithshan <skithshan93@gmail.com> (github.com/Sandaru293)
 * @since 10/9/2021
 */
public class ItemController {
    public boolean addItem(Item i) throws ClassNotFoundException, SQLException {
        return CrudUtil.execute("INSERT into Item VALUES (?,?,?,?)",i.getCode(),i.getDescription(),i.getUnitPrice(),i.getQtyOnHand());
    }

}
