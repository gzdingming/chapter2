package org.smart4j.chapter2.service;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.smart4j.chapter2.helper.DatabaseHelper;import org.smart4j.chapter2.model.Customer;import java.util.List;import java.util.Map;/** * @ClassName CustomerService * @Description TODO * @Author mac * @Date 2019-05-02 09:30 PM * Version 1.0 **/public class CustomerService {    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);    /**     * @Author mac     * @Description //TODO     * @Date 09:31 PM 2019-05-02     * @Param [keyword]     * @return List<Customer>     **/    public List<Customer> getCustomerList(){        String sql = "SELECT * FROM CUSTOMER";        return DatabaseHelper.queryEntityList(Customer.class, sql);    }    /**     * @Author mac     * @Description //TODO     * @Date 09:34 PM 2019-05-02     * @Param [id]     * @return org.smart4j.chapter2.model.Customer     **/    public Customer getCustomer(long id){        String sql = "SELECT * FROM CUSTOMER WHERE id=" + id;        return DatabaseHelper.queryEntity(Customer.class, sql);    }    /**     * @Author mac     * @Description //TODO     * @Date 09:35 PM 2019-05-02     * @Param [fieldMap]     * @return boolean     **/    public boolean createCustomer(Map<String, Object> fieldMap){        return DatabaseHelper.insertEntity(Customer.class, fieldMap);    }    /**     * @Author mac     * @Description //TODO      * @Date 09:35 PM 2019-05-02     * @Param [id, fieldMap]     * @return boolean     **/    public boolean updateCustomer(long id, Map<String, Object> fieldMap){        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);    }    /**     * @Author mac     * @Description //TODO      * @Date 09:36 PM 2019-05-02     * @Param []     * @return boolean     **/    public boolean deleteCustomer(long id){        return DatabaseHelper.deleteEntity(Customer.class, id);    }}