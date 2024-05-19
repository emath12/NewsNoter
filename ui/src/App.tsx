import { useQuery, gql } from "@apollo/client";
import Header from "./components/Header.tsx";

// const GET_LOCATIONS = gql`
//     query findArticle($filter : ArticleFilter) {
//         articles(filter: $filter) {
//             link
//             headline
//             category
//             short_description
//             authors
//             date
//         }
//     }
// `;
//
// function DisplayLocations() {
//     const { loading, error, data } = useQuery(GET_LOCATIONS);
//
//     if (loading) return <p>Loading...</p>;
//     if (error) return <p>Error :(</p>;
//     //@ts-ignore
//     return data.locations.map(({ id, name, description, photo }) => (
//         <div key={id}>
//             <h3>{name}</h3>
//             <img width="400" height="250" alt="location-reference" src={`${photo}`} />
//             <br />
//             <b>About this location:</b>
//             <p>{description}</p>
//             <br />
//         </div>
//     ));
// }

export default function App() {
    return (
        <div>
            <Header />
        </div>
    );
}
