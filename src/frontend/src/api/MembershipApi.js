import axios from 'axios'

const URL = "http://localhost:8080/ClubMembership/"

export const membership_find = (clubId, memberId) => {
    return axios.get(`${URL}find?clubId=${clubId}&memberId=${memberId}`).then(
        result => result.data
    )
}

export const membership_findAll = (clubId) =>{
	return axios.get(`${URL}find-all?clubId=${clubId}`).then(
        result => result.data
    )
}

export const membership_register = (membership) =>{
	return axios.post(`${URL}register`,membership).then(
        result => (result.status === 201 )
    )
}

export const membership_remove = (clubId, memberId) =>{
	return axios.delete(`${URL}remove?clubId=${clubId}&memberId=${memberId}`).then(
        result => result.data
    )
}

export const membership_update = (membership) =>{
	return axios.patch(`${URL}update/{membership.clubId}`,membership).then(
        result => (result.status === 201)
    )
}