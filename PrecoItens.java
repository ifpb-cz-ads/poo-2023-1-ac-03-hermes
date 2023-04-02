class PrecoItens
{
    public static void main(String[] args){
        double itemVenda1 = 2.95f;
        double itemVenda2 = 3.50f;
        double precoTotal = itemVenda1 + itemVenda2;
        double percentual = 8.25 / 100.0;
        double taxaCalculada = precoTotal + (percentual * precoTotal);
        System.out.println("O item 1 custa: " + itemVenda1 + "\nO Item 2 custa: "+ itemVenda2 + "\nPreço total: "+ precoTotal + "\nTaxa: "+ taxaCalculada);
        
        //Questões e) | f)
        itemVenda1 = itemVenda1 + (percentual * itemVenda1);
        itemVenda2 = itemVenda2 + (percentual * itemVenda2);
        double novoCusto = itemVenda1 + itemVenda2;
        boolean muitoCaro = novoCusto > 10;
        System.out.println("Está muito caro? " + muitoCaro);
    }
