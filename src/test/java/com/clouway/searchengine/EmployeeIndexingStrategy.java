package com.clouway.searchengine;

/**
 * @author Ivan Lazov <ivan.lazov@clouway.com>
 */
public class EmployeeIndexingStrategy implements IndexingStrategy<Employee> {

  @Override
  public String getIndexName() {
    return Employee.class.getSimpleName();
  }

  @Override
  public String getId(Employee employee) {
    return String.valueOf(employee.id);
  }

  @Override
  public IndexingSchema getIndexingSchema() {
    return new IndexingSchema.IndexingSchemaBuilder().fields("firstName")
                                                     .fullTextFields("lastName")
                                                     .build();
  }
}
