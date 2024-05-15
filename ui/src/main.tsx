import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.tsx'
import './index.css'
import {
    ApolloClient,
    ApolloProvider,
    createHttpLink,
    gql,
    InMemoryCache,
    NormalizedCacheObject,
    split,
    useQuery,
    useSubscription,

} from '@apollo/client';

// const client = new ApolloClient({
//     uri: 'http://localhost:8080/graphql',
//     cache: new InMemoryCache(),
// });

const httpLink = createHttpLink({uri:'http://localhost:8080/graphql' })
const client: ApolloClient<NormalizedCacheObject> = new ApolloClient({
    link: httpLink,
    cache: new InMemoryCache()
});

//@ts-ignore

client
.query({
    query: gql`
        query getArticles {
            articles(filter: {}) {
                link
                headline
                category
                short_description
                authors
                date
            }
        }
    `,
})
    //@ts-ignore
.then((result) => console.log(result));

ReactDOM.createRoot(document.getElementById('root')!).render(

    <ApolloProvider client={client}>
        <App />
    </ApolloProvider>,
)
