
package repository;

import model.Budget;
import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BudgetRepository extends JpaRepository<Budget, Long> {
    // Custom query methods

    // Find budgets by category
    List<Budget> findByCategory(String category);

    // Find budgets by month and year
    List<Budget> findByMonthAndYear(Integer month, Integer year);

    // Find budgets for a specific category and year
    List<Budget> findByCategoryAndYear(String category, Integer year);

    List<Budget> findByUserId(Long userId);
    
    List<Budget> findByUser(User user);

}
