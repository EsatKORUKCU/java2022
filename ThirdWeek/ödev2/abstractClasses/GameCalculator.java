package abstractClasses;

public abstract class GameCalculator { 
    public abstract void hesapla();  // hesaplayı kim kullanırsa kendi hesaplama verilerini yapmak zorunda


    public final  void gameOver() { // gamecalculator kim kullanırsa gameover oldugu gibi kullanmak zorunda demektir bu satır
        System.out.println("Oyun bitti");
    }
}
