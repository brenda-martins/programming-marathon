package beecrowd.effectiveJava.builder;

public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;


    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
    }

    public static class Builder{

        private int servingSize;
        private int servings;
        private int calories = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val;
            return this;
        }

        public Builder servingSize(int val){
            servingSize = val;
            return this;
        }

        public Builder servings(int val){
            servings = val;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
}
