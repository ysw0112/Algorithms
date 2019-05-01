package hackerRank.javaTutorial;

public class test {
  public static void main(String[] args) {
    String a = "{\" uu\":\"\",\"aoid\":\"\",\"ua\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36\",\"aid\":\"20\",\"do\":\"\",\"adnxs\":\"\",\"dt\":\"닌텐도 스위치 정보 게시판 | 루리웹\",\"cate\":\"닌텐도 스위치 정보 게시판\",\"arid\":\"\",\"ardt\":\"\",\"ogu\":\"\",\"l\":\"http://bbs.ruliweb.com/nin/board/300004\",\"r\":\"http://bbs.ruliweb.com/nin/board/300143?cate=497\\\",\"vt\":\"1555563250310\",\"etc\":\"\",\"adid\":\"\"}";
    String b = "댓글 | 총 84 개 1  ON  과대포장 (4722966)  59.24.***.***  BEST 재생속도 올린거겠지? 19.04.18 10:28  56 0 고등어 \u0011 \u0010\u0010\u0010\u0011 (5072106)  115.91.***.***  BEST 이거 부산가면 저정도는 아니지만 체험 가능합니다 영도 , 동래산성을 가보세여 19.04.18 10:12  52 1 BAAAAAAM (5178837)  114.200.***.***  BEST    시발? 이로하자카??";
    String c = "{\\\"action_type\\\":\\\"VIS\\\",\\\"log_type\\\":\\\"view\\\",\\\"action_id\\\":\\\"42f8ba470996f31bc3f3e5e4b9023f9\\\",\\\"created_at\\\":\\\"2019-04-19 13:32:54\\\",\\\"client_ip\\\":\\\"128.90.149.251\\\",\\\"title\\\":\\\"%E6%AF%8E%E6%97%A5%E5%8B%95%E7%94%BB+-+%E6%AF%8E%E6%97%A5%E6%96%B0%E8%81%9E\\\",\\\"uuid\\\":\\\"\\\",\\\"url\\\":\\\"https%3A%2F%2Fvideo.mainichi.jp%2Fdetail%2Fvideos%2F%25E6%2596%25B0%25E7%259D%2580%2Fvideo%2F6027817072001%3FautoStart%3Dtrue\\\",\\\"ogurl\\\":\\\"https%3A%2F%2Fvideo.mainichi.jp%2Fdetail%2Fvideos%2F%25E6%2596%25B0%25E7%259D%2580%2Fvideo%2F6027817072001%3FautoStart%3Dtrue\\\",\\\"referrer_url\\\":\\\"\\\",\\\"userAgent\\\":\\\"\\\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.75 Safari/537.36\\\"\\\",\\\"acc_id\\\":\\\"102\\\",\\\"global_uuid\\\":\\\"gFqV+1y5T3IAAW96\\\",\\\"nick\\\":\\\"\\\",\\\"adid\\\":\\\"\\\",\\\"dna_key\\\":null, \\\"aoid\\\":\\\"e8e04cb4-3e60-4c63-b3d3-e3968391f38a\\\",\\\"adnxs_uid\\\":\\\"0\\\",\\\"acc_type\\\":\\\"news\\\",\\\"news_category\\\":\\\"\\\",\\\"art_id\\\":\\\"\\\",\\\"art_created_at\\\":\\\"\\\"}";


    System.out.print(c.replaceAll("\"|\n|\u0010", ""));

  }
}
