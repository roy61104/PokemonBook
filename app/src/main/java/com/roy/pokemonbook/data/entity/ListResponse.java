package com.roy.pokemonbook.data.entity;

import java.util.List;


public class ListResponse {

    private Integer count;
    private String next;
    private Integer previous;
    private List<ResultsBean> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Integer getPrevious() {
        return previous;
    }

    public void setPrevious(Integer previous) {
        this.previous = previous;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getId() {
            return url.split("/")[6];
        }


        public String getImageUrl() {
            //https://pokeapi.co/api/v2/pokemon/1/
            String index = url.split("/")[6];
            try {
                int i = Integer.parseInt(index);
            } catch (Exception e) {
                index = "1";
            }
            return "https://pokeres.bastionbot.org/images/pokemon/" + index + ".png";
        }
    }


}
