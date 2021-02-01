import axios from 'axios'

const URL = "http://localhost:8080/CommunityMember/"

export const member_find = (memberId) => {
    return axios.get(`${URL}find?memberId=${memberId}`).then(
        result => result.data
    )
}

export const member_findByName = (memberName) =>{
	return axios.get(`${URL}find-by-name?memberName=${memberName}`).then(
        result => result.data
    )
}

export const member_register = (member) =>{
	return axios.post(`${URL}register`,member).then(
        result => (result.status === 201 )
    )
}

export const member_remove = (memberId) =>{
	return axios.delete(`${URL}remove?memberId=${memberId}`).then(
        result => result.data
    )
}

export const member_update = (member) =>{
	return axios.patch(`${URL}/{member.email}`,member).then(
        result => (result.status === 201)
    )
}