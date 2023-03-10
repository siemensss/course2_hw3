public class Bicycle extends Transport{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        return;
    }

    @Override
    public  void checkTrailer(){
        return;
    };

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}