package ua.com.service;


import ua.com.entity.Group;

public interface GroupCrudService extends CrudService<Group> {

    void addStudentToGroup(Long groupId, Long studentId);

    void deleteStudentFromGroup(Long groupId, Long studentId);

}