package edu.citytech.server.loadXML;

import java.sql.ResultSet;

public interface SQLExecutable <T> {
    T exec(ResultSet rs) throws Exception;
}
