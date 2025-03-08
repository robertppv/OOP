//Ex4: pair

    class Pair {
        private int v;
        private int t[];
        public Pair(int x, int[] y){v = x; t = y;}
        public void setVT(int x, int[] y){v = x; t = y;}
        public void setVIT(int x, int i, int y){v = x; t[i] = y;}
        public int getV() {return v;}
        public int[] getT() {return t;}
    }


    class Main{
        public static Pair call(Pair p, Pair q){
            q.setVT(15, p.getT());
            q = p;
            q.setVIT(25, 0, 20);
            int tz[] = {36, 6};
            return new Pair(12, tz);
        }
        public static void main(String argv[]){
            int ta[] = {85, 9};
            int tb[] = {25, 68};
            Pair a = new Pair(18, ta);
            Pair b = new Pair(9, tb);
            Pair c = b;
            b = call(a, b);
            System.out.println(c.getT[0]);
        }
    }//Rs: 20
