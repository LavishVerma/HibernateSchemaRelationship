package com.HibernatePractice.databaseSchema.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HibernatePractice.databaseSchema.models.Category;
import com.HibernatePractice.databaseSchema.models.User_Details;
import com.HibernatePractice.databaseSchema.models.User_Recipe;
import com.HibernatePractice.databaseSchema.repository.CategoryRepository;
import com.HibernatePractice.databaseSchema.repository.User_Details_Repository;
import com.HibernatePractice.databaseSchema.repository.User_Recipe_Repository;

@RestController
@RequestMapping("/testing")
public class MainController {
	
	 @Autowired
	 CategoryRepository Crepo;
    
	 @Autowired
	 User_Details_Repository Drepo;
		
	 @Autowired
     User_Recipe_Repository Rrepo;
	
  @SuppressWarnings("null")
@GetMapping("/testDatabase")
  public void getFunction()
  {
    User_Details user_details =new User_Details();
   
    User_Recipe user_recipes=new User_Recipe();
    
    user_details.setFirstname("Lavish");
    user_details.setLastname("Verma");
    user_details.setPhonenumber("7986301375");
    user_details.setPassword("Lavish123");
    user_details.setProfileimage("https://abc.com/profilepicture.jpg");
    user_details.setAbout("Passionate home cook from amritsar");
    user_details.setDateofbirth("13/11/1997");
    user_details.setEmail("Lavishverma97@gmail.com");
    
    Drepo.save(user_details);
   
    user_recipes.setCooktime(20);
    user_recipes.setDescription("tasty delicious uhmmm");
    user_recipes.setIngredients("200g paneer,Maida 2 tbsp,Corn flour 3 tbsp,Rice flour 3 tbsp,1 pinch red food colouring,1/2 teaspoon salt or as per taste,Soy sauce 1 tbsp,Lemon juice 1 tbsp,Ginger garlic paste 1 tbsp,Coriander powder 1 tsp,Chilli powder 1 teaspoon,Garam masala 1 teaspoon");
    user_recipes.setName("Paneer 65");
    user_recipes.setPreparationtime(20); 
    user_recipes.setRating(4.5);
    user_recipes.setServings(4);
    user_recipes.setSteps("Cube paneer into bite sized pieces, Add all flour in a bowl ,Add spice powders and salt,Add ginger garlic paste and red food colouring ,Add soy sauce and lemon juice,add water as required to form thick smooth batter,Add paneer and coat well with batter,Deep fry paneer until crisp and golden brown. drain excess oil,Fry little curry leaves and 2-3 green chillies for garnish,Garnish with fried curry leaves, chillies and serve hot with lemon wedges");
    user_recipes.setTips("bla bla blu blu");
    user_recipes.setTypeofcuisine("snacks");
    user_recipes.setUser(user_details);  
   
     
     
 List<Category> lc=new ArrayList<>();
 Category category[] = new Category[10];  
 for(int i=0;i<10;i++)
 {
	 category[i] =new Category();
	 category[i].setCategoryname("paneer"+" "+i);
	 category[i].setUserrecipe(user_recipes);    
	 lc.add(category[i]);
	// Crepo.save(category[i]);
 }
  user_recipes.setItems(lc); 
Rrepo.save(user_recipes);
 



 
 
 
   
    
    
    
  }
	

}
