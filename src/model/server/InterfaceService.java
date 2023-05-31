package model.server;

import model.entity.Laptop;

public interface InterfaceService {

    void sendDataToDAOForSave(Laptop laptop);
    Laptop sendIdToDAOForSearch(long id);
    boolean sendIdToDAOForDelete(long id);
    boolean sendDataToDAOForUpdate(long id);
}
