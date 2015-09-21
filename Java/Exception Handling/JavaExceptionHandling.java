class myCalculator
    {
public int power(int n, int p) throws Exception {
    Double power = 0.0;
    Integer d = 0;
    if (n < 0 || p < 0) {

            throw new Exception("n and p should be non-negative");

    } else {
        power = Math.pow(n, p);
        d = power.intValue(); 

    }
    return d;
}
}