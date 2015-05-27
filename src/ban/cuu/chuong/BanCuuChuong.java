/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ban.cuu.chuong;

/**
 *
 * @author philhps02210 Noriki Style
 */
public class BanCuuChuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, n, x;
        for(i=1;i<=10;i++){
            for(n=1;n<=10;n++){
                x = i * n;
                System.out.println(i+" x " +n+ " = " +x+"\t");
            }
            System.out.println("\n");
        }
            
    }
    
}
