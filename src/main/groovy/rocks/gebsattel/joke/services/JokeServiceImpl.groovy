package rocks.gebsattel.joke.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokeServiceImpl implements JokeService {

    /** Spring will create this final variable once
     *  and reuse it for all JokeService-Objects
     *  without changing between them.
     */
    private final ChuckNorrisQuotes chuckNorrisQuotes

    public JokeServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes()
    }

    @Override
    String getJoke(){
        return chuckNorrisQuotes.randomQuote()
    }
}
