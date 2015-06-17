public class Stage {

    private static class StageHolder {
        private static Stage instance = new Stage();

    }

    public static Stage getInstance(){
        return StageHolder.instance;
    }

    public void mStage(){
        System.out.println("Stage");

    }

}
