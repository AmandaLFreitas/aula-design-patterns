public class Pizza {

    private String size;
    private String dough;
    private String sauce;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;
    private boolean chicken;
    private boolean corn;
    private boolean onion;
    private boolean tomato;
    private boolean olive;
    private boolean stuffedCrust;
    private boolean chocolate;
    private boolean strawberry;
    private boolean condensedMilk;

    public void setSize(String size) {
        this.size = size;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public void setChicken(boolean chicken) {
        this.chicken = chicken;
    }

    public void setCorn(boolean corn) {
        this.corn = corn;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setOlive(boolean olive) {
        this.olive = olive;
    }

    public void setStuffedCrust(boolean stuffedCrust) {
        this.stuffedCrust = stuffedCrust;
    }

    public void setChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public void setStrawberry(boolean strawberry) {
        this.strawberry = strawberry;
    }

    public void setCondensedMilk(boolean condensedMilk) {
        this.condensedMilk = condensedMilk;
    }

    @Override
    public String toString() {
        return """
                Pizza
                --------------------------
                Tamanho: %s
                Massa: %s
                Molho: %s
                Queijo: %s
                Pepperoni: %s
                Bacon: %s
                Frango: %s
                Milho: %s
                Cebola: %s
                Tomate: %s
                Azeitona: %s
                Borda recheada: %s
                Chocolate: %s
                Morango: %s
                Leite condensado: %s
                """.formatted(
                size,
                dough,
                sauce,
                cheese,
                pepperoni,
                bacon,
                chicken,
                corn,
                onion,
                tomato,
                olive,
                stuffedCrust,
                chocolate,
                strawberry,
                condensedMilk
        );
    }
}