package TheBook.Chapter1;

//Compute your weight on the moon.


class Task1Moon {

    public static void main (String[] args) {
        double earthweight, moonweight;

        earthweight = 200;
        moonweight = earthweight * 0.17;

        System.out.println(earthweight +
                " pounds your weight on the Earth is equivalent "
                + moonweight + " pounds on the Moon.");
    }

}
