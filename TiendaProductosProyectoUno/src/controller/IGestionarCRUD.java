
package controller;

/**
 *
 * @author Lenovo
 */
public interface IGestionarCRUD {
    public void createDB(Object[] pers);
    public void listDB();
    public void deleteDB(int id);
    public void updateDB(Object[] pers);
}
