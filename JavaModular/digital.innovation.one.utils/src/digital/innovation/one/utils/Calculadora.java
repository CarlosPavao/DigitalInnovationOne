package digital.innovation.one.utils;

import digital.innovation.one.utils.Interno.DivHelper;
import digital.innovation.one.utils.Interno.MultiHelper;
import digital.innovation.one.utils.Interno.SubHelper;
import digital.innovation.one.utils.Interno.SumHelper;


public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultiHelper multiHelper;
    private DivHelper divHelper;

    public Calculadora(){
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multiHelper = new MultiHelper();
        divHelper = new DivHelper();
    }

    public int sum(int a, int b){
        return  sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int multi(int a, int b){
        return multiHelper.execute(a,b);
    }

    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
}
