import java.util.Scanner;

public class ID {

    public String xingzuo(String a) {
        int n = 0;
        String g, t;


        Object[][] idtoad = {


                {"0321", "白羊座"},
                {"0322", "白羊座"},
                {"0323", "白羊座"},
                {"0324", "白羊座"},
                {"0325", "白羊座"},
                {"0326", "白羊座"},
                {"0327", "白羊座"},
                {"0328", "白羊座"},
                {"0329", "白羊座"},
                {"0330", "白羊座"},
                {"0331", "白羊座"},
                {"0401", "白羊座"},
                {"0402", "白羊座"},
                {"0403", "白羊座"},
                {"0404", "白羊座"},
                {"0405", "白羊座"},
                {"0406", "白羊座"},
                {"0407", "白羊座"},
                {"0408", "白羊座"},
                {"0409", "白羊座"},
                {"0410", "白羊座"},
                {"0411", "白羊座"},
                {"0412", "白羊座"},
                {"0413", "白羊座"},
                {"0414", "白羊座"},
                {"0415", "白羊座"},
                {"0416", "白羊座"},
                {"0417", "白羊座"},
                {"0418", "白羊座"},
                {"0419", "白羊座"},
                {"0420", "白羊座"},
                {"0421", "金牛座"},
                {"0422", "金牛座"},
                {"0423", "金牛座"},
                {"0424", "金牛座"},
                {"0425", "金牛座"},
                {"0426", "金牛座"},
                {"0427", "金牛座"},
                {"0428", "金牛座"},
                {"0429", "金牛座"},
                {"0430", "金牛座"},
                {"0431", "金牛座"},
                {"0501", "金牛座"},
                {"0502", "金牛座"},
                {"0503", "金牛座"},
                {"0504", "金牛座"},
                {"0505", "金牛座"},
                {"0506", "金牛座"},
                {"0507", "金牛座"},
                {"0508", "金牛座"},
                {"0509", "金牛座"},
                {"0510", "金牛座"},
                {"0511", "金牛座"},
                {"0512", "金牛座"},
                {"0513", "金牛座"},
                {"0514", "金牛座"},
                {"0515", "金牛座"},
                {"0516", "金牛座"},
                {"0517", "金牛座"},
                {"0518", "金牛座"},
                {"0519", "金牛座"},
                {"0520", "金牛座"},
                {"0521", "金牛座"},
                {"0522", "双子座"},
                {"0523", "双子座"},
                {"0524", "双子座"},
                {"0525", "双子座"},
                {"0526", "双子座"},
                {"0527", "双子座"},
                {"0528", "双子座"},
                {"0529", "双子座"},
                {"0530", "双子座"},
                {"0531", "双子座"},
                {"0601", "双子座"},
                {"0602", "双子座"},
                {"0603", "双子座"},
                {"0604", "双子座"},
                {"0605", "双子座"},
                {"0606", "双子座"},
                {"0607", "双子座"},
                {"0608", "双子座"},
                {"0609", "双子座"},
                {"0610", "双子座"},
                {"0611", "双子座"},
                {"0612", "双子座"},
                {"0613", "双子座"},
                {"0614", "双子座"},
                {"0615", "双子座"},
                {"0616", "双子座"},
                {"0617", "双子座"},
                {"0618", "双子座"},
                {"0619", "双子座"},
                {"0620", "双子座"},
                {"0621", "双子座"},
                {"0622", "巨蟹座"},
                {"0623", "巨蟹座"},
                {"0624", "巨蟹座"},
                {"0625", "巨蟹座"},
                {"0626", "巨蟹座"},
                {"0627", "巨蟹座"},
                {"0628", "巨蟹座"},
                {"0629", "巨蟹座"},
                {"0630", "巨蟹座"},
                {"0631", "巨蟹座"},
                {"0701", "巨蟹座"},
                {"0702", "巨蟹座"},
                {"0703", "巨蟹座"},
                {"0704", "巨蟹座"},
                {"0705", "巨蟹座"},
                {"0706", "巨蟹座"},
                {"0707", "巨蟹座"},
                {"0708", "巨蟹座"},
                {"0709", "巨蟹座"},
                {"0710", "巨蟹座"},
                {"0711", "巨蟹座"},
                {"0712", "巨蟹座"},
                {"0713", "巨蟹座"},
                {"0714", "巨蟹座"},
                {"0715", "巨蟹座"},
                {"0716", "巨蟹座"},
                {"0717", "巨蟹座"},
                {"0718", "巨蟹座"},
                {"0719", "巨蟹座"},
                {"07620", "巨蟹座"},
                {"0721", "巨蟹座"},
                {"0722", "巨蟹座"},
                {"0723", "狮子座"},
                {"0724", "狮子座"},
                {"0725", "狮子座"},
                {"0726", "狮子座"},
                {"0727", "狮子座"},
                {"0728", "狮子座"},
                {"0729", "狮子座"},
                {"0730", "狮子座"},
                {"0731", "狮子座"},
                {"0801", "狮子座"},
                {"0802", "狮子座"},
                {"0803", "狮子座"},
                {"0804", "狮子座"},
                {"0805", "狮子座"},
                {"0806", "狮子座"},
                {"0807", "狮子座"},
                {"0808", "狮子座"},
                {"0809", "狮子座"},
                {"0810", "狮子座"},
                {"0811", "狮子座"},
                {"0812", "狮子座"},
                {"0813", "狮子座"},
                {"0814", "狮子座"},
                {"0815", "狮子座"},
                {"0816", "狮子座"},
                {"0817", "狮子座"},
                {"0818", "狮子座"},
                {"0819", "狮子座"},
                {"0820", "狮子座"},
                {"0821", "狮子座"},
                {"0822", "狮子座"},
                {"0823", "狮子座"},
                {"0824", "处女座"},
                {"0825", "处女座"},
                {"0826", "处女座"},
                {"0827", "处女座"},
                {"0828", "处女座"},
                {"0829", "处女座"},
                {"0830", "处女座"},
                {"0831", "处女座"},
                {"0901", "处女座"},
                {"0902", "处女座"},
                {"0903", "处女座"},
                {"0904", "处女座"},
                {"0905", "处女座"},
                {"0906", "处女座"},
                {"0907", "处女座"},
                {"0908", "处女座"},
                {"0909", "处女座"},
                {"0910", "处女座"},
                {"0911", "处女座"},
                {"0912", "处女座"},
                {"0913", "处女座"},
                {"0914", "处女座"},
                {"0915", "处女座"},
                {"0916", "处女座"},
                {"0917", "处女座"},
                {"0918", "处女座"},
                {"0919", "处女座"},
                {"0920", "处女座"},
                {"0921", "处女座"},
                {"0922", "处女座"},
                {"0923", "处女座"},
                {"0924", "天秤座"},
                {"0925", "天秤座"},
                {"0926", "天秤座"},
                {"0927", "天秤座"},
                {"0928", "天秤座"},
                {"0929", "天秤座"},
                {"0930", "天秤座"},
                {"0931", "天秤座"},
                {"1001", "天秤座"},
                {"1002", "天秤座"},
                {"1003", "天秤座"},
                {"1004", "天秤座"},
                {"1005", "天秤座"},
                {"1006", "天秤座"},
                {"1007", "天秤座"},
                {"1008", "天秤座"},
                {"1009", "天秤座"},
                {"1010", "天秤座"},
                {"1011", "天秤座"},
                {"1012", "天秤座"},
                {"1013", "天秤座"},
                {"1014", "天秤座"},
                {"1015", "天秤座"},
                {"1016", "天秤座"},
                {"1017", "天秤座"},
                {"1018", "天秤座"},
                {"1019", "天秤座"},
                {"1020", "天秤座"},
                {"1021", "天秤座"},
                {"1022", "天秤座"},
                {"1023", "天秤座"},
                {"1024", "天蝎座"},
                {"1025", "天蝎座"},
                {"1026", "天蝎座"},
                {"1027", "天蝎座"},
                {"1028", "天蝎座"},
                {"1029", "天蝎座"},
                {"1030", "天蝎座"},
                {"1031", "天蝎座"},
                {"1101", "天蝎座"},
                {"1102", "天蝎座"},
                {"1103", "天蝎座"},
                {"1104", "天蝎座"},
                {"1105", "天蝎座"},
                {"1106", "天蝎座"},
                {"1107", "天蝎座"},
                {"1108", "天蝎座"},
                {"1109", "天蝎座"},
                {"1110", "天蝎座"},
                {"1111", "天蝎座"},
                {"1112", "天蝎座"},
                {"1113", "天蝎座"},
                {"1114", "天蝎座"},
                {"1115", "天蝎座"},
                {"1116", "天蝎座"},
                {"1117", "天蝎座"},
                {"1118", "天蝎座"},
                {"1119", "天蝎座"},
                {"1120", "天蝎座"},
                {"1121", "天蝎座"},
                {"1122", "天蝎座"},
                {"1123", "射手座"},
                {"1124", "射手座"},
                {"1125", "射手座"},
                {"1126", "射手座"},
                {"1127", "射手座"},
                {"1128", "射手座"},
                {"1129", "射手座"},
                {"1130", "射手座"},
                {"1131", "射手座"},
                {"1201", "射手座"},
                {"1202", "射手座"},
                {"1203", "射手座"},
                {"1204", "射手座"},
                {"1205", "射手座"},
                {"1206", "射手座"},
                {"1207", "射手座"},
                {"1208", "射手座"},
                {"1209", "射手座"},
                {"1210", "射手座"},
                {"1211", "射手座"},
                {"1212", "射手座"},
                {"1213", "射手座"},
                {"1214", "射手座"},
                {"1215", "射手座"},
                {"1216", "射手座"},
                {"1217", "射手座"},
                {"1218", "射手座"},
                {"1219", "射手座"},
                {"1220", "射手座"},
                {"1221", "射手座"},

                {"1222", "摩羯座"},
                {"1223", "摩羯座"},
                {"1224", "摩羯座"},
                {"1225", "摩羯座"},
                {"1226", "摩羯座"},
                {"1227", "摩羯座"},
                {"1228", "摩羯座"},
                {"1229", "摩羯座"},
                {"1230", "摩羯座"},
                {"1231", "摩羯座"},
                {"0101", "摩羯座"},
                {"0102", "摩羯座"},
                {"0103", "摩羯座"},
                {"0104", "摩羯座"},
                {"0105", "摩羯座"},
                {"0106", "摩羯座"},
                {"0107", "摩羯座"},
                {"0108", "摩羯座"},
                {"0109", "摩羯座"},
                {"0110", "摩羯座"},
                {"0111", "摩羯座"},
                {"0112", "摩羯座"},
                {"0113", "摩羯座"},
                {"0114", "摩羯座"},
                {"0115", "摩羯座"},
                {"0116", "摩羯座"},
                {"0117", "摩羯座"},
                {"0118", "摩羯座"},
                {"0119", "摩羯座"},
                {"0120", "摩羯座"},
                {"0121", "水瓶座"},
                {"0122", "水瓶座"},
                {"0123", "水瓶座"},
                {"0124", "水瓶座"},
                {"0125", "水瓶座"},
                {"0126", "水瓶座"},
                {"0127", "水瓶座"},
                {"0128", "水瓶座"},
                {"0129", "水瓶座"},
                {"0130", "水瓶座"},
                {"0131", "水瓶座"},
                {"0201", "水瓶座"},
                {"0202", "水瓶座"},
                {"0203", "水瓶座"},
                {"0204", "水瓶座"},
                {"0205", "水瓶座"},
                {"0206", "水瓶座"},
                {"0207", "水瓶座"},
                {"0208", "水瓶座"},
                {"0209", "水瓶座"},
                {"0210", "水瓶座"},
                {"0211", "水瓶座"},
                {"0212", "水瓶座"},
                {"0213", "水瓶座"},
                {"0214", "水瓶座"},
                {"0215", "水瓶座"},
                {"0216", "水瓶座"},
                {"0217", "水瓶座"},
                {"0218", "水瓶座"},
                {"0219", "水瓶座"},
                {"0220", "摩羯座"},
                {"0221", "射手座"},
                {"0222", "摩羯座"},
                {"0223", "摩羯座"},
                {"0224", "摩羯座"},
                {"0225", "摩羯座"},
                {"0226", "摩羯座"},
                {"0227", "摩羯座"},
                {"0228", "摩羯座"},
                {"0229", "摩羯座"},
                {"0230", "摩羯座"},
                {"0231", "摩羯座"},
                {"0301", "摩羯座"},
                {"0302", "摩羯座"},
                {"0303", "摩羯座"},
                {"0304", "摩羯座"},
                {"0305", "摩羯座"},
                {"0306", "摩羯座"},
                {"0307", "摩羯座"},
                {"0308", "摩羯座"},
                {"0309", "摩羯座"},
                {"0310", "摩羯座"},
                {"0311", "摩羯座"},
                {"0312", "摩羯座"},
                {"0313", "摩羯座"},
                {"0314", "摩羯座"},
                {"0315", "摩羯座"},
                {"0316", "摩羯座"},
                {"0317", "摩羯座"},
                {"0318", "摩羯座"},
                {"0319", "摩羯座"},
                {"0320", "摩羯座"},


        };



        for (int i = 0; i < idtoad.length; i++) {
            if (idtoad[i][0].equals(a.substring(10, 14))) {//到第4位结束
                StringBuilder str = new StringBuilder();//创建字符拼接变量
                for (int j = 1; j < idtoad[i].length; j++) {
                    str.append(idtoad[i][j]);//拼接
                }
                System.out.println("您的星座是" + str);
            }


        }
        return null;
    }
}
