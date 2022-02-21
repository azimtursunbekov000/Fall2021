package step_defs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public  class DataTableSteps {
    @Given("user is on NambaFood")
    public void user_is_on_namba_food() {
        System.out.println("User scrool down to Arigato");

       
    }
    @When("user click on Foods")
    public void user_click_on_foods() {
        System.out.println("User clicked on Arigato");
       
    }
    @Then("user should find Sushi category")
    public void user_should_find_sushi_category() {

    }
    @When("user click on Sushi")
    public void user_click_on_sushi() {
        
       
    }
    @Then("user should see List of cafes")
    public void user_should_see_list_of_cafes() {
        
       
    }
    @Then("user should scroll down the page to Arigato cafe")
    public void user_should_scroll_down_the_page_to_arigato_cafe() {

    }
    @When("user click on Arigato")
    public void user_click_on_arigato() {
        
       
    }
    @Then("user should see Arigato menu")
    public void user_should_see_arigato_menu() {
        
       
    }
    @Then("user should find Kimchi")
    public void user_should_find_kimchi() {
        
       
    }
    @When("user increase Kimchi amount to {int}")
    public void user_increase_kimchi_amount_to(Integer int1) {
        
       
    }
    @When("user should click on Order button")
    public void user_should_click_on_order_button() {
        
       
    }
    @Then("on the Card user should {int} s")
    public void on_the_card_user_should_see_s(Integer integer) {
        System.out.println("Total price" + integer);
       
    }




    @Given("user is on {string}")
    public void user_is_on(String URL) {
        System.out.println("User is on " + URL);
    }
    @Then("following menu bar should be display on Home page")
    public void following_menu_bar_should_be_display_on_home_page(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists((Type) String.class);
        System.out.println(data.get(0).get(1));
    }


    @Given("user is on cars.kg")
    public void user_is_on_cars_kg() {

    }
    @Then("following cars should be displayed")
    public void following_cars_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {

    }

}
