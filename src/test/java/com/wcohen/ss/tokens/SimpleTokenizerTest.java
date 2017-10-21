package com.wcohen.ss.tokens;

import com.wcohen.ss.api.Token;
import org.junit.Before;
import org.junit.Test;

import static com.wcohen.ss.tokens.SimpleTokenizer.DEFAULT_TOKENIZER;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SimpleTokenizerTest {
    private SimpleTokenizer tokenizer;

    @Before
    public void setUp() {
        tokenizer = DEFAULT_TOKENIZER;
    }

    @Test
    public void simpleTest() {
        Token[] tokens = tokenizer.tokenize("a");

        assertNotNull(tokens);
        assertThat(tokens.length, is(1));

        Token token1 = tokens[0];
        assertThat(token1.getIndex(), is(1));
        assertThat(token1.getValue(), is("a"));
    }

    @Test
    public void simpleTestWithDot() {
        Token[] tokens = tokenizer.tokenize("a.b");

        assertThat(tokens.length, is(2));

        assertThat(tokens[0].getValue(), is("a"));
        assertThat(tokens[1].getValue(), is("b"));

        assertThat(tokens[0].getIndex(), is(1));
        assertThat(tokens[1].getIndex(), is(2));
    }
}