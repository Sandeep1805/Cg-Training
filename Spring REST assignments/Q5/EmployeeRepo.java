package REST.SpringRESTassignments.Q5;

import org.springframework.data.mongodb.repository.MongoRepository;

import REST.SpringRESTassignments.Q7.Order;

public interface EmployeeRepo extends MongoRepository<Employee, String> {
    
}
