package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner inp = new Scanner(System.in);

    int row;
    int col;
    int r, c,count;
    int mine;
    String[][] mineMap;
    String[][] gameMap;
    boolean isTrue = true;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineMap = new String[row][col];
        this.gameMap = new String[row][col];
        this.mine = (row * col) / 4;
    }
    public void MineMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gameMap[i][j] = "-";
                mineMap[i][j] = "-";
                System.out.print(gameMap[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
    public void randomNumber() {
        Random r = new Random();
        for (int i = 0; i < this.mine; i++) {
            int rnum = r.nextInt(this.row);
            int rnum2 = r.nextInt(this.col);
            if (!this.mineMap[rnum][rnum2].equals("*")) {
                this.mineMap[rnum][rnum2] = "*";
            }
        }
    }
    public void printMineMap() {
        randomNumber();
        System.out.println("Mayınların konumu");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (!this.mineMap[i][j].equals("*")) {
                    this.mineMap[i][j] = "-";
                }
                System.out.print(mineMap[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
    public void control() {
        count=0;
        for(int i=(r-1); i <= (r+1); i++){
            for (int j = (c-1); j <= (c+1); j++) {
                if(i<0 || j<0 || i >= this.row || j >= this.col){
                    continue;
                }
                if(this.mineMap[i][j].equals("*")){
                    count++;
                }
            }
        }
        this.gameMap[r][c] = String.valueOf(count);
        this.mineMap[r][c] = String.valueOf(count);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.gameMap[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public boolean finish() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void ChooseIndex() {
        isTrue = false;
        while (!isTrue) {
            System.out.print("Satır griiniz : ");
            r = inp.nextInt();
            System.out.print("Sutün giriniz : ");
            c = inp.nextInt();

            r-=1;
            c-=1;
            if(r>row || c>col || r<=-1||c<=-1){
                System.out.println("İndeks sınırlarını aştınız yeniden deneyin...");
                continue;
            }
            if (mineMap[r][c].equals("*")) {
                System.out.println("Oyun bitti");
                break;
            }
            control();
            if (finish()) {
                System.out.println("Oyunu kazandınız");
                break;
            }

        }
    }
    public void run(){
        MineMap();
        printMineMap();
        ChooseIndex();

    }




}