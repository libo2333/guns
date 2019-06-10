package com.stylefeng.guns.rest.modular.film.bean.resultvo;

import com.stylefeng.guns.rest.modular.film.bean.dictionary.Category;
import com.stylefeng.guns.rest.modular.film.bean.dictionary.FilmYear;
import com.stylefeng.guns.rest.modular.film.bean.dictionary.Source;

import java.io.Serializable;
import java.util.List;

/**
 * @author czy
 * @date 2019/6/5 9:43
 */
public class ConditionData implements Serializable {
    private List<Category> catInfo;
    private List<Source> sourceInfo;
    private List<FilmYear> yearInfo;

    public List<Category> getCatInfo() {
        return catInfo;
    }

    public void setCatInfo(List<Category> catInfo) {
        this.catInfo = catInfo;
    }

    public List<Source> getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(List<Source> sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public List<FilmYear> getYearInfo() {
        return yearInfo;
    }

    public void setYearInfo(List<FilmYear> yearInfo) {
        this.yearInfo = yearInfo;
    }

    @Override
    public String toString() {
        return "ConditionData{" +
                "catInfo=" + catInfo +
                ", sourceInfo=" + sourceInfo +
                ", yearInfo=" + yearInfo +
                '}';
    }
}
