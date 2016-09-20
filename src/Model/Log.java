package Model;

/**
 * Created by carl on 2016-09-20.
 */
public class Log {
    private Member[] memArr= new Member[10];


    public void member(Member newMem){
        memArr[1] = newMem;
    }
    public Member getMem(int index){
        return memArr[index];
    }
}
