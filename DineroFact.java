class DineroFact 
{
    float facR (float n)
	{
        float resultado;
        if (n==1) return 1;
        resultado=facR(n-1)*n;
        return resultado;
    }
}