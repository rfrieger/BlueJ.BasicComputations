 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        Integer normalAngle = angle % 360;
       
        return normalAngle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        Integer normalAngel = Math.floorMod(integer, 360);
        return normalAngel;
    }

    public static void main(String[] args){

    }
}
