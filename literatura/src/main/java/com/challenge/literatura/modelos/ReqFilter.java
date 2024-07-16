package com.challenge.literatura.modelos;
import java.util.ArrayList;

public record ReqFilter(Integer count, String next, String previous, ArrayList<Object> results ) {
}
