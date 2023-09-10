package StaticConcepts.static_variable;

class Learning {
    private static int targerMonth = 2;
    private String language;

    public Learning(int targerMonth, String language) {
        Learning.targerMonth = targerMonth;
        this.language = language;
    }

    public void printTarget() {
        System.out.println("I have set a goal to finish " + this.language + " within " + targerMonth + " months.");
    }
}
