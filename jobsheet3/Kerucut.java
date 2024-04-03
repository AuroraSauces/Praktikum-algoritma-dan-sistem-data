public class Kerucut {
    int jarikrc;
    int sisimiring;
    public Kerucut() {
        
    }

    double volumekerucut() {
         
    return  (1.0 / 3.0) * 3.14 * jarikrc * jarikrc *  Math.sqrt(jarikrc * jarikrc - sisimiring * sisimiring);
    
    }

    double luasPermukaankerucut() {
        
        return (2 * 3.14 * jarikrc * Math.sqrt(jarikrc * jarikrc - jarikrc * jarikrc)) + (2 * 3.14 * jarikrc * jarikrc);
    }
}