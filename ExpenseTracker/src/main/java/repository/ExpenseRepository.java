
package repository;

import model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // Custom query methods

    // Find expenses by category
    List<Expense> findByCategory(String category);

    // Find expenses on a specific date
    List<Expense> findByDate(Date date);

    // Find expenses within a date range
    List<Expense> findByDateBetween(Date startDate, Date endDate);
    
    List<Expense> findByUserId(Long userId);

}
