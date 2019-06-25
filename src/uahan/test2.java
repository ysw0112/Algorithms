package uahan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test2 {
  public static void pushResultMap(Map<String, Integer> result, String size, String type){
    if(result.containsKey(type)){
      result.put(type, result.get(type) + Integer.valueOf(size.substring(0, size.length() - 1)));
    }else{
      result.put(type, Integer.valueOf(size.substring(0, size.length() - 1)));
    }
  }
  public static void main(String[] args) {
//    String S = "my.song.mp3 11b\ngreetingsong.flac 1000b\nno3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
    String S = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
    String[] splitInputData = S.split("\n");
    Map<String, Integer> result = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    result.put("music", 0);
    result.put("images", 0);
    result.put("movies", 0);
    result.put("other", 0);

    for(int i=0; i<splitInputData.length; i++){
      if(splitInputData[i].split(" ")[0].matches("^\\S+.(mp3|aac|flac)$")){
        //music
        String size = splitInputData[i].split(" ")[1];
        pushResultMap(result, size, "music");

      }else if(splitInputData[i].split(" ")[0].matches("^\\S+.(jpg|bmp|gif)$")){
        //images
        String size = splitInputData[i].split(" ")[1];
        pushResultMap(result, size, "images");
      }else if(splitInputData[i].split(" ")[0].matches("^\\S+.(mp4|avi|mkv)$")){
        //movies
        String size = splitInputData[i].split(" ")[1];
        pushResultMap(result, size, "movies");
      }else{
        //other
        String size = splitInputData[i].split(" ")[1];
        pushResultMap(result, size, "other");
      }
    }
    String output = String.format("music %sb\nimages %sb\nmovies %sb\nother %sb", result.get("music"), result.get("images"), result.get("movies"), result.get("other"));
    System.out.println(output);
  }
}
