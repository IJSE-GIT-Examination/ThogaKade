package lk.ijse.ThogaKade.controller;

import lk.ijse.ThogaKade.model.Customer;
import lk.ijse.ThogaKade.utils.CrudUtil;

import java.sql.SQLException;

/**
 * @author Sandaru Kithshan <skithshan93@gmail.com> (github.com/Sandaru293)
 * @since 10/9/2021
 */

public class CustomerController {

    public boolean addCustomer(Customer c) throws ClassNotFoundException, SQLException {
        return CrudUtil.execute("INSERT into Customer VALUES (?,?,?,?)",c.getId(),c.getName(),c.getAddress(),c.getSalary());
    }
}
