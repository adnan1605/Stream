package stream;

public enum Subject {
    PHYSICS(1),CHEMISTRY(2),MATHS(3),HINDI(4),ENGLISH(5);
    private final int rank;

    Subject(int rank){
        this.rank=rank;
    }

    public int getRank() {
        return rank;
    }

    int getRank(String str){
        try{
            return Subject.valueOf(str.toUpperCase()).getRank();
        }catch (IllegalArgumentException exception ){
            return -1;
        }
    }
}
