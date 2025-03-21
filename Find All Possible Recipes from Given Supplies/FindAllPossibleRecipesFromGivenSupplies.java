//TC: O(nk)+O(s)
//SC: O(s+n)
/**
    n - number of recipes
    k - avg number of ingredients per recipe
    s - number of unique supplies
 */

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashSet<String> s = new HashSet<>();
        for(String supply: supplies){
            s.add(supply);            
        }
        List<String> res = new ArrayList<>();
        int n = recipes.length;
        boolean newRecipeFound = true;
		//Perform the following operation till a new recipe is not found
        while(newRecipeFound){
            int st = s.size();
            for(int i = 0; i < n; i++){
                String currRecipe = recipes[i];
                if(!s.contains(currRecipe)){
                    List<String> ingredient = ingredients.get(i);
                    int k = ingredient.size();
                    boolean present = true;
					//check if all the ingredients required for a recipe are presnt in our supplies
                    for(int j = 0; j < k; j++){
                        String currIngrediant = ingredient.get(j);						
                        if(!s.contains(currIngrediant)){
                            present = false;
                            break;
                        }
                    }
                    if(present){                    
                        if(!s.contains(currRecipe)){
                            res.add(currRecipe);
                            s.add(currRecipe);
                        }
                    }
                }
            }
            int end = s.size();
            if(st == end){
                newRecipeFound = false;
            }
        }
                
        return res;
    }
}