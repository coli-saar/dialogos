package com.clt.speech.recognition;

import com.clt.speech.Language;
import com.clt.srgf.Grammar;

/**
 * Speech recognizers need a context that is based on an interpretation grammar.
 *
 * @author Daniel Bobbert
 * @version 1.0
 */
public class RecognitionContext {

    private String name;
    private Domain domain;
    private Language language;
    private Grammar grammar;

    public RecognitionContext(String name, Domain domain, Language language, Grammar grammar) {

        this.name = name;
        this.domain = domain;
        this.language = language;
        this.grammar = grammar;
    }

    public String getName() {
        return this.name;
    }

    public Grammar getGrammar() {
        return this.grammar;
    }

    public Domain getDomain() {
        return this.domain;
    }

    public Language getLanguage() {
        return this.language;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @SuppressWarnings("unused")
    public void dispose() {
        // no need for cleanup here
    }

}
