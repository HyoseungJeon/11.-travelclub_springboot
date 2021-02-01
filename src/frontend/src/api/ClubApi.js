import axios from 'axios'

const URL = "http://localhost:8080/TravelClub/"
const proxyURL = "/TravelClub/"

export const club_find = (clubId) => {
    return axios.get(`${proxyURL}find?clubId=${clubId}`,

    {
        headers:{
		"Access-Control-Allow-Origin": "*",
	}

    }).then(
        result => result.data
    )
}

export const club_findByName = (name) =>{
	return axios.get(`${proxyURL}find-by-name?name=${name}`,{

        headers:{
		"Access-Control-Allow-Origin": "*",
        }
    }).then(
        result => result.data
    )
}

export const club_register = (club) =>{
	return axios.post(`${proxyURL}register`,club).then(
        result => (result.status === 201 )
    )
}

export const club_remove = (clubId) =>{
	return axios.delete(`${proxyURL}remove?clubId=${clubId}`).then(
        result => result.data
    )
}

export const club_update = (club) =>{
	return axios.patch(`${URL}/{club.usid}`,club).then(
        result => (result.status === 201)
    )
}