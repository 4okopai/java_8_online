package ua.com.Service;

import ua.com.Ent.BaseEntity;
import ua.com.Ent.Department;

import java.io.IOException;

public interface CrudService <BE extends BaseEntity>{

    void create(BE be);
    BE update(BE be) throws IOException;
    Department[] delete(String id) throws IOException;
    BE findOne(String id) throws IOException;
    BE[] findAll();

}