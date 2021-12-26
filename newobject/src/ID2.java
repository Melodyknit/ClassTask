public class ID2 {

    int []IDnum =new int[18];
    String s=null;
    String ee="y";
    int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n10=0,n11=0
            ,n12=0,n13=0,n14=0,n15=0,n16=0,n17=0;
    double sum = 0 ,d=0;
    String z,w;
    int w1=0,n=0;
    public String shenhe(String a) {

        //把字符串逐个转入数组
        for(int i=0; i<a.length(); i++){

            IDnum[i]=a.charAt(i)-'0';

        }

        w1=a.length();//判断是多少位(18)
        if(w1==18||w1==15){

            if(w1==18){
            //第18位检验原理
            n1=IDnum[0]*7;n2=IDnum[1]*9;n3=IDnum[2]*10;n4=IDnum[3]*5;n5=IDnum[4]*8;
            n6=IDnum[5]*4;n7=IDnum[6]*2;n8=IDnum[7];n9=IDnum[8]*6;n10=IDnum[9]*3;
            n11=IDnum[10]*7;n12=IDnum[11]*9;n13=IDnum[12]*10;n14=IDnum[13]*5;n15=IDnum[14]*8;
            n16=IDnum[15]*4;n17=IDnum[16]*2;

            sum=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12+n13+n14+n15+n16+n17;
                System.out.println(sum);
            d=sum%11;
                System.out.println(d);
                int c = (int) d;//把d转为整型c,只有整型可转字符
                System.out.println(d);

                String l =String.valueOf(c);//把c转换为字符l，用于equals比较

                w=a.substring(17);//提取第18位数校验
                n = Integer.parseInt(w);//把第18位转整型n，用于switch

                switch(n){
                    //更换为对应的数
                    // 校验第18位对应的数：
//0 1 2 3 4 5 6 7 8 9 10
//1 0 X 9 8 7 6 5 4 3 2
                    case 0:
                        s="1";break;
                    case 1:
                        s="0";break;
                    case 2:
                        s="x";break;
                    case 3:
                        s="9";break;
                    case 4:
                        s="8";break;
                    case 5:
                        s="7";break;
                    case 6:
                        s="6";break;
                    case 7:
                        s="5";break;
                    case 8:
                        s="4";break;
                    case 9:
                        s="3";break;
                    case 10:
                        s="2";break;

                }

                if(s.equals(l)){

                //校验成功
                System.out.println("您的18位身份证号码：" + a);

            }
            else {
                //校验失败

                System.out.println("您输入的号码校验码有误！！");ee="n";
            }

            }

            if(w1==15){
                System.out.println("您的15位身份证号码："+a);
            }

        }
        //判断是多少位(15)
        else{
            //判断长度够不够



            System.out.println("您输入的长度有误！！");ee="n";
            }
        return ee;
        }
    }

