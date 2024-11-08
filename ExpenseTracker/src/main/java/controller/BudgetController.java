
package controller;

import DTO.BudgetRequest;
import model.Budget;
import service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budgets")
public class BudgetController {
    
    @Autowired
    private BudgetService budgetService;

//    @PostMapping("/create")
//    public Budget createBudget(@RequestBody Budget budget, @RequestParam String username) {
//        return budgetService.createBudget(budget, username);
//    }
    
    @PostMapping("/create")
    public Budget createBudget(@RequestBody BudgetRequest budgetRequest) {
        return budgetService.createBudget(budgetRequest); 
    }

    @GetMapping("/user")
    public List<Budget> getBudgetsForUser(@RequestParam String username) {
        return budgetService.getAllBudgetsForUser(username);
    }    
    
    
    @GetMapping()
    public List<Budget> getAllBudgets() {
        return budgetService.getAllBudgets();
    }
    
    @GetMapping("/{id}")
    public Budget getBudgetBasedOnId(@PathVariable("id") long id)
    {
        return budgetService.getBudgetByID(id); 
    }

    @PutMapping("/{id}")
    public Budget updateBudget(@PathVariable Long id, @RequestBody Budget budget) {
        return budgetService.updateBudget(id, budget);
    }

    @DeleteMapping("/{id}")
    public void deleteBudget(@PathVariable Long id) {
        budgetService.deleteBudget(id);
    }
    
    @GetMapping("/test")
    public String testEndpoint() {
        return "Budget controller is working!";
    }

} 
