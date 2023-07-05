package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        StringBuilder builder = new StringBuilder();
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

        int counter = 0;

        while (counter < personArray.length){
            //result = String.valueOf(personArray[counter]);
            result = String.valueOf(builder.append((personArray[counter])));
            counter += 1;

        }

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        StringBuilder builder = new StringBuilder();
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        for (int i = 0; i < personArray.length; i++){
            result = String.valueOf(builder.append((personArray[i])));
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        StringBuilder builder = new StringBuilder();
        // identify array's type
        // identify array's variable-name

        for(Person counter: personArray){
            result = String.valueOf(builder.append(counter));
        }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
